package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.CommentGeneratorConfiguration;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.Context;
import org.mybatis.generator.config.JDBCConnectionConfiguration;
import org.mybatis.generator.config.JavaClientGeneratorConfiguration;
import org.mybatis.generator.config.JavaModelGeneratorConfiguration;
import org.mybatis.generator.config.JavaTypeResolverConfiguration;
import org.mybatis.generator.config.ModelType;
import org.mybatis.generator.config.PluginConfiguration;
import org.mybatis.generator.config.SqlMapGeneratorConfiguration;
import org.mybatis.generator.config.TableConfiguration;
import org.mybatis.generator.internal.DefaultShellCallback;

public class MGBConfig {
    public static void main(String[] args) throws Exception{
         //配置xml配置项
         List<String> warnings = new ArrayList<String>();
         boolean overwrite = true;
         Configuration config = new Configuration();
         Context context = new Context(ModelType.CONDITIONAL);
         context.setTargetRuntime("MyBatis3");
         context.setId("defaultContext");
         
        //自动识别数据库关键字，默认false，如果设置为true，
        //根据SqlReservedWords中定义的关键字列表；一般保留默认值，遇到数据库关键字（Java关键字），
        //使用columnOverride覆盖
         context.addProperty("autoDelimitKeywords","true");
         
        //生成的Java文件的编码
        context.addProperty("javaFileEncoding","utf-8");
        context.addProperty("beginningDelimiter","`");
        context.addProperty("endingDelimiter","`");
        //格式化java代码
        context.addProperty("javaFormatter","org.mybatis.generator.api.dom.DefaultJavaFormatter");
        //格式化xml代码
        context.addProperty("xmlFormatter","org.mybatis.generator.api.dom.DefaultXmlFormatter");
        //格式化信息
        PluginConfiguration pluginConfiguration = new PluginConfiguration();
        pluginConfiguration.setConfigurationType("org.mybatis.generator.plugins.SerializablePlugin");
        pluginConfiguration.setConfigurationType("org.mybatis.generator.plugins.ToStringPlugin");
        context.addPluginConfiguration(pluginConfiguration);
        
        //设置是否去除生成注释
        CommentGeneratorConfiguration commentGeneratorConfiguration = new CommentGeneratorConfiguration();
        commentGeneratorConfiguration.addProperty("suppressAllComments","true");
        //commentGeneratorConfiguration.addProperty("suppressDate","true");
        context.setCommentGeneratorConfiguration(commentGeneratorConfiguration);
    
        //设置连接数据库
        JDBCConnectionConfiguration jdbcConnectionConfiguration = new JDBCConnectionConfiguration();
        jdbcConnectionConfiguration.setDriverClass("com.mysql.jdbc.Driver");
        jdbcConnectionConfiguration.setConnectionURL("jdbc:mysql://localhost:3306/test?serverTimezone=GMT%2B8");
        jdbcConnectionConfiguration.setPassword("123456");
        jdbcConnectionConfiguration.setUserId("root");
        context.setJdbcConnectionConfiguration(jdbcConnectionConfiguration);
        
        JavaTypeResolverConfiguration javaTypeResolverConfiguration = new JavaTypeResolverConfiguration();
        //是否使用bigDecimal， false可自动转化以下类型（Long, Integer, Short, etc.）
        javaTypeResolverConfiguration.addProperty("forceBigDecimals","false");
        context.setJavaTypeResolverConfiguration(javaTypeResolverConfiguration);
        
        //生成实体类的地址
        JavaModelGeneratorConfiguration javaModelGeneratorConfiguration = new JavaModelGeneratorConfiguration();
        javaModelGeneratorConfiguration.setTargetPackage("com.example.model");
        javaModelGeneratorConfiguration.setTargetProject("src/main/java");
        javaModelGeneratorConfiguration.addProperty("enableSubPackages","true");
        javaModelGeneratorConfiguration.addProperty("trimStrings","true");
        context.setJavaModelGeneratorConfiguration(javaModelGeneratorConfiguration);
        
        //生成的xml的地址
        SqlMapGeneratorConfiguration sqlMapGeneratorConfiguration = new SqlMapGeneratorConfiguration();
        sqlMapGeneratorConfiguration.setTargetProject("src/main/resources");
        sqlMapGeneratorConfiguration.setTargetPackage("mappers");
        sqlMapGeneratorConfiguration.addProperty("enableSubPackages","true");
        context.setSqlMapGeneratorConfiguration(sqlMapGeneratorConfiguration);
        
        //生成注解接口
        JavaClientGeneratorConfiguration javaClientGeneratorConfiguration = new JavaClientGeneratorConfiguration();
        javaClientGeneratorConfiguration.setTargetPackage("com.example.mapper");
        javaClientGeneratorConfiguration.setTargetProject("src/main/java");
        //注解形式 ANNOTATEDMAPPER  xml形式 XMLMAPPER
        javaClientGeneratorConfiguration.setConfigurationType("ANNOTATEDMAPPER");
        javaClientGeneratorConfiguration.addProperty("enableSubPackages","true");
        context.setJavaClientGeneratorConfiguration(javaClientGeneratorConfiguration);
        
        TableConfiguration tableConfiguration = new TableConfiguration(context);
        tableConfiguration.setTableName("t_lrb");
        tableConfiguration.setCountByExampleStatementEnabled(true);
        tableConfiguration.setUpdateByExampleStatementEnabled(true);
        tableConfiguration.setDeleteByExampleStatementEnabled(true);
        tableConfiguration.setInsertStatementEnabled(true);
        tableConfiguration.setDeleteByPrimaryKeyStatementEnabled(true);        
        context.addTableConfiguration(tableConfiguration);
        
        config.addContext(context);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }
    
}
