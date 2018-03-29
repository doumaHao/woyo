package cn.douma.woyo.mybatis.plugin;

import org.mybatis.generator.api.CommentGenerator;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.*;
import org.mybatis.generator.api.dom.xml.Document;
import org.mybatis.generator.api.dom.xml.XmlElement;

import java.util.List;

import static org.mybatis.generator.internal.util.StringUtility.stringHasValue;
import static org.mybatis.generator.internal.util.messages.Messages.getString;

/**
 * 生成器分页插件
 *
 * @author Li Shaohua
 * @create 2017-08-21 下午12:01
 **/
public class PagePlugin extends PluginAdapter {
    private String dbType;
    private Dialect dialect;

    public PagePlugin() {
    }

    public boolean validate(List<String> warnings) {
        dbType = properties.getProperty("dbType"); //$NON-NLS-1$
        boolean result = stringHasValue(dbType);
        if (result) {
            dbType = dbType.toUpperCase();// 忽略大小写
            if (dbType.equals("ORACLE")) {
                dialect = new OracleDialect();
            } else if (dbType.equals("MYSQL")) {
                dialect = new MysqlDialect();
            } else if (dbType.equals("SQLSERVER")) {
                dialect = new SQLServerDialect();
            } else {// 不支持其他数据库
                result = false;
                warnings.add(getString("RuntimeError.18", "RenameExampleClassPlugin", "searchString"));
            }
        } else {
            warnings.add(getString("ValidationError.18", "RenameExampleClassPlugin", "searchString")); //$NON-NLS-1$
        }
        return result;
    }

    @Override
    public boolean modelExampleClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        addPage(topLevelClass, introspectedTable);
        return super.modelExampleClassGenerated(topLevelClass, introspectedTable);
    }

    /**
     * 修改mapper.xml,支持分页和批量
     */
    @Override
    public boolean sqlMapDocumentGenerated(Document document, IntrospectedTable introspectedTable) {
        dialect.addPageableSuffix(document, introspectedTable);
        return super.sqlMapDocumentGenerated(document, introspectedTable);
    }

    @Override
    public boolean sqlMapSelectByExampleWithoutBLOBsElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        XmlElement newElement = dialect.addPageableToSelectByExample(element, introspectedTable);
        return super.sqlMapUpdateByExampleWithoutBLOBsElementGenerated(newElement, introspectedTable);
    }

    /**
     * 修改Example类,添加分页支持
     *
     * @param topLevelClass
     * @param introspectedTable
     */
    private void addPage(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        CommentGenerator commentGenerator = context.getCommentGenerator();
        //.add offset Field
        Field offsetField = new Field();
        offsetField.setVisibility(JavaVisibility.PROTECTED);
        offsetField.setType(new FullyQualifiedJavaType("java.lang.Long"));
        offsetField.setName("offset");
        commentGenerator.addFieldComment(offsetField, introspectedTable);
        topLevelClass.addField(offsetField);

        //.add limit Field
        Field limitField = new Field();
        limitField.setVisibility(JavaVisibility.PROTECTED);
        limitField.setType(new FullyQualifiedJavaType("java.lang.Long"));
        limitField.setName("limit");
        commentGenerator.addFieldComment(limitField, introspectedTable);
        topLevelClass.addField(limitField);

        //.add end Field
        Field endField = new Field();
        endField.setVisibility(JavaVisibility.PROTECTED);
        endField.setType(new FullyQualifiedJavaType("java.lang.Long"));
        endField.setName("end");
        commentGenerator.addFieldComment(endField, introspectedTable);
        topLevelClass.addField(endField);

        Field countField = new Field();
        countField.setVisibility(JavaVisibility.PROTECTED);
        countField.setType(new FullyQualifiedJavaType("java.lang.Long"));
        countField.setName("count");
        commentGenerator.addFieldComment(countField, introspectedTable);
        topLevelClass.addField(countField);

        //.add setPagination method
        Method setPaginationMethod = new Method("setPagination");
        setPaginationMethod.setVisibility(JavaVisibility.PUBLIC);
        setPaginationMethod.addParameter(new Parameter(new FullyQualifiedJavaType("long"), "offset"));
        setPaginationMethod.addParameter(new Parameter(new FullyQualifiedJavaType("long"), "limit"));
        setPaginationMethod.addBodyLine("this.offset = offset;");
        setPaginationMethod.addBodyLine("this.limit = limit;");
        setPaginationMethod.addBodyLine("this.end = offset + limit;");
        commentGenerator.addGeneralMethodComment(setPaginationMethod, introspectedTable);
        topLevelClass.addMethod(setPaginationMethod);

        //.add setCount method
        Method setCountMethod = new Method("setCount");
        setCountMethod.setVisibility(JavaVisibility.PUBLIC);
        setCountMethod.addParameter(new Parameter(new FullyQualifiedJavaType("long"), "count"));
        setCountMethod.addBodyLine("this.count = count;");
        commentGenerator.addGeneralMethodComment(setCountMethod, introspectedTable);
        topLevelClass.addMethod(setCountMethod);

        Method getCountMethod = new Method("getCount");
        getCountMethod.setVisibility(JavaVisibility.PUBLIC);
        getCountMethod.setReturnType(new FullyQualifiedJavaType("long"));
        getCountMethod.addBodyLine("return this.count;");
        commentGenerator.addGeneralMethodComment(getCountMethod, introspectedTable);
        topLevelClass.addMethod(getCountMethod);
    }
}
