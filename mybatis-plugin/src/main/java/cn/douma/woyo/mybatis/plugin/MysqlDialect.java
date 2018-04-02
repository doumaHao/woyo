package cn.douma.woyo.mybatis.plugin;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.Document;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;

/**
 * mysql方言
 *
 * @author Li Shaohua
 * @create 2017-08-21 下午2:04
 **/
public class MysqlDialect implements Dialect {


    public void addPageableSuffix(Document document, IntrospectedTable introspectedTable) {
        XmlElement parentElement = document.getRootElement();
        // 1.产生mysql分页的limit条件 TODO limit分页方式待优化
        XmlElement paginationSuffixElement = new XmlElement("sql");
        paginationSuffixElement.addAttribute(new Attribute("id", "MysqlDialectSuffix"));
        XmlElement pageEnd = new XmlElement("if");
        pageEnd.addAttribute(new Attribute("test", "offset != null and limit != null"));
        pageEnd.addElement(new TextElement("<![CDATA[ limit #{offset}, #{limit}]]>"));
        paginationSuffixElement.addElement(pageEnd);
        parentElement.addElement(paginationSuffixElement);
    }


    public XmlElement addPageableToSelectByExample(XmlElement element, IntrospectedTable introspectedTable) {
        XmlElement paginationElement = new XmlElement("include"); //$NON-NLS-1$
        paginationElement.addAttribute(new Attribute("refid", "MysqlDialectSuffix"));
        element.getElements().add(paginationElement);
        return element;
    }


}
