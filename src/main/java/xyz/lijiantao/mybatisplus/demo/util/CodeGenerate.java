package xyz.lijiantao.mybatisplus.demo.util;

import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.springframework.util.StringUtils;

import java.util.Scanner;

/**
 * Created by Jiantao Li on 2018/12/29 13:52
 */
public class CodeGenerate {

//    @Value("${spring.datasource.url}")
//    private static String url;
//
//    @Value("${spring.datasource.driver-class-name}")
//    private static String driverClassName;
//
//    @Value("${spring.datasource.username}")
//    private static String userName;
//
//    @Value("${spring.datasource.password}")
//    private static String password;



    public static String scanner(String tip) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("请输入" + tip + "：");
        System.out.println(stringBuilder.toString());
        if (scanner.hasNext()) {
            String str = scanner.next();
            if (!StringUtils.isEmpty(str)) {
                return str;
            }
        }
        throw new MybatisPlusException("请输入正确的" + tip + "!");
    }

    public static void main(String[] args){
        AutoGenerator autoGenerator = new AutoGenerator();

        //全局配置
        GlobalConfig globalConfig = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        globalConfig.setOutputDir(projectPath+ "/src/main/java");
        globalConfig.setAuthor("Jiantao Li");
        globalConfig.setOpen(false);
        autoGenerator.setGlobalConfig(globalConfig);

        //数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://192.168.135.136:3306/gongzi?characterEncoding=utf8&useSSL=false");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("mysql");
        dsc.setPassword("mysql");
        autoGenerator.setDataSource(dsc);

        //包名配置
        PackageConfig pkc = new PackageConfig();
        pkc.setModuleName(scanner("模块名"));
        pkc.setParent("xyz.lijiantao.mybatisplus.demo");
        autoGenerator.setPackageInfo(pkc);

        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {

            }
        };

        //模版引擎 freemarker
//        String templatePath = "/templates/mapper.xml.ftl";
//
//        List<FileOutConfig> foclist = new ArrayList<FileOutConfig>();
//        foclist.add(new FileOutConfig(templatePath) {
//            @Override
//            public String outputFile(TableInfo tableInfo) {
//                return projectPath + "/src/main/resources/mapper/" + pkc.getModuleName() + "/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
//            }
//        });
//        cfg.setFileOutConfigList(foclist);
//        autoGenerator.setCfg(cfg);

//        TemplateConfig templateConfig = new TemplateConfig();
//        templateConfig.setXml(null);
//        autoGenerator.setTemplate(templateConfig);


        //策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
//        strategy.setSuperEntityClass("xyz.lijiantao.mybatisplus.demo.model.BaseEntity");
        strategy.setEntityLombokModel(true);
        strategy.setRestControllerStyle(true);
//        strategy.setSuperControllerClass("xyz.lijiantao.mybatisplus.demo.controller.BaseController");
        strategy.setInclude(scanner("表名"));
        strategy.setSuperEntityColumns("id");
        strategy.setControllerMappingHyphenStyle(true);
        strategy.setTablePrefix(pkc.getModuleName()+"_");
        autoGenerator.setStrategy(strategy);

        autoGenerator.execute();
    }
}
