1 项目启动 在web.xml 通过 org.springframework.web.context.ContextLoaderListener  监听  加载 dubbo-provider.xml
2 通过 dubbo-provider.xml 向zookeeper注册接口,及实现类
3 消费端通过zookeeper注册中心 订阅 服务端提供的接口  zookeeper将消费端的请求 转发到 服务提供端  进行响应处理
4 dubbo-provider.xml 一定要放到src/main/resources/  项目进行编译后  才会 生成到  targer/classes 下  