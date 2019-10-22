# [JAVA高级面试题](https://juejin.im/post/5ae97721f265da0b7a20811f)
## List和Set比较，各自的子类比较
 1) List和Set都是Collection的子接口（Collection是jdk1.2版本提供的）。
 Collection提供集合基本操作接口方法，具体实现由各个子类自行实现（SPI）（如是否允许重复元素、是否有序...）
 SpringApplicationBuilder