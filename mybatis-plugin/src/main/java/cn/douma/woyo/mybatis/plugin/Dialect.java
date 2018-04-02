package cn.douma.woyo.mybatis.plugin;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.xml.Document;
import org.mybatis.generator.api.dom.xml.XmlElement;

/**
 * 不同数据库方言
 *
 * @author Li Shaohua
 * @create 2017-08-21 下午2:02
 **/
public interface Dialect {
    /**
     * @param element
     * @param introspectedTable
     * @return
     */
    XmlElement addPageableToSelectByExample(XmlElement element, IntrospectedTable introspectedTable);

    /**
     *
     * @param document
     * @param introspectedTable
     */
    void addPageableSuffix(Document document, IntrospectedTable introspectedTable);
}
