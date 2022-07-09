# demo
> 如果 linux jdk8 tomcat 的 WEB-INF/lib 下面有多个版本不同的相同依赖（比如serialkiller-0.4.jar 和 serialkiller-0.5.jar），tomcat 究竟用哪个是 随机的，这源于 不同 linux 的 filesystem 的差异。如果是 docker ，那么就取决于 宿主机的 filesystem 的差异（与镜像无关）。


本仓库是为了验证 Linux 中 jdk8 下 tomcat 使用 lib 的随机性的demo

https://inhann.top/2022/06/28/tomcat_random_lib/
