zuul的核心就是Filter，Filter一共包括四个生命周期：
1. pre 请求在被路由之前调用，可以用作鉴权
2. routing 将请求路由到微服务
3. post 用于添加Http头，收集统计信息，将响应发送给客户端
4. error 在其他阶段发生错误时执行该过滤器