// @Configuration
// public class JpaConfig {

//     @Bean(name = "h2DataSource")
//     public DataSource h2DataSource()
//     {
//         DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
//         dataSourceBuilder.driverClassName("org.h2.Driver");
//         dataSourceBuilder.url("jdbc:h2:file:C:/temp/test");
//         dataSourceBuilder.username("sa");
//         dataSourceBuilder.password("");
//         return dataSourceBuilder.build();
//     }

//     // @Bean(name = "mysqlDataSource")
//     // @Primary
//     // public DataSource mysqlDataSource()
//     // {
//     //     DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
//     //     dataSourceBuilder.url("jdbc:mysql://localhost/testdb");
//     //     dataSourceBuilder.username("dbuser");
//     //     dataSourceBuilder.password("dbpass");
//     //     return dataSourceBuilder.build();
//     // }
// }