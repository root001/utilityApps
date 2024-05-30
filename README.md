# utilityApps
Utility Apps
# Static Vs Non-static
Non-static applies to indivdual insatnces of an object but not the object itself

e.g Cat myCat = new Cat();
myCat.makesSound();

Static applies to methods, variables which are valid for the class.

e.g public class Cat(){
    public static int count = 0;

    public Cat(){
        count++;
    }

    public static int getCount(){
        return count;
    }
}

Cat.getCount();

KeypromoterX  - an intellij plugin for shortcuts

#Usefuls Configs


    spring.datasource.hikari.maximum-pool-size=150
    spring.datasource.hikari.idle-timeout=240000
    spring.datasource.hikari.minimum-idle=10
    spring.datasource.hikari.max-lifetime=240000
    spring.datasource.hikari.connection-timeout=40000
  
    #spring.datasource.url=jdbc:postgresql://172.24.30.220:32099/apcdb
    spring.datasource.url=jdbc:postgresql://pgpool.biller:32099/apcdb
    spring.datasource.username=apc_services
    spring.datasource.password=CLA1a93SrvCeT2
    spring.datasource.driver-class-name=org.postgresql.Driver

    ######## Jpa Properties
    spring.jpa.properties.hibernate.temp.use_jdbc_metadata_defaults = false
    spring.jpa.database-platform=org.hibernate.dialect.PostgreSQL95Dialect
    spring.jpa.properties.hibernate.cache.use_second_level_cache=false
    spring.jpa.properties.hibernate.cache.use_query_cache=false
    spring.jpa.properties.hibernate.cache.region.factory_class=org.hibernate.cache.ehcache.EhCacheRegionFactory
    spring.jpa.hibernate.naming.implicit-strategy=org.hibernate.boot.model.naming.ImplicitNamingStrategyLegacyJpaImpl
    spring.jpa.hibernate.naming.physical-strategy=com.africa.airtel.spine.configuration.AirtelPhysicalNamingStrategy
    spring.jpa.show-sql=false
    spring.jpa.properties.hibernate.format_sql=true
    spring.jpa.properties.hibernate.generate_statistics=true

    ##Hibernate ddl auto (create, create-drop, validate, update)
    spring.jpa.hibernate.ddl-auto=none

