
/**
 * 夏辰义
 * 2026/7/1617:31
 */
public class 总纲 {
}
/*
第一阶段：文件与目录操作（File 类）
表格
主题	内容
创建 File 对象	三种构造方式、路径分隔符
创建文件/目录	createNewFile()、mkdir()、mkdirs()
获取文件信息	getName()、getAbsolutePath()、length()、lastModified()
文件属性判断	exists()、isFile()、isDirectory()、canRead()、canWrite()
目录遍历	list()、listFiles()、带过滤器遍历
递归遍历	递归算法遍历所有子目录和文件
文件操作	重命名 renameTo()、删除 delete()、递归删除
常见陷阱	mkdir() vs mkdirs()、listFiles() 判空、路径分隔符
第二阶段：字节流（基础 IO）
表格
主题	内容
字节流概念	InputStream / OutputStream 抽象类
FileInputStream	逐字节读取、批量读取（byte[] 缓冲区）
FileOutputStream	逐字节写入、批量写入、追加模式
文件复制	边读边写、缓冲区优化
资源关闭	try-with-resources 自动关闭
中文乱码问题	字节流处理中文的局限性
常见陷阱	write(byte[], 0, len) 必须指定长度、忘记关闭流
第三阶段：字符流（文本专用）
表格
主题	内容
字符流概念	Reader / Writer 抽象类
FileReader	逐字符读取、批量读取（char[]）
FileWriter	直接写字符串、追加模式
编码问题	默认编码陷阱、UTF-8 vs GBK
转换流	InputStreamReader / OutputStreamWriter 指定编码
文本文件复制	字符流版本
适用场景	什么时候用字节流 / 字符流
第四阶段：缓冲流（效率提升）
表格
主题	内容
缓冲字节流	BufferedInputStream / BufferedOutputStream
缓冲字符流	BufferedReader / BufferedWriter
按行读写	readLine()、newLine()
装饰器模式	包装流的设计原理
性能对比	缓冲 vs 非缓冲的效率差异
最佳实践	always 用 Buffered 包装
第五阶段：数据流与对象流（高级类型）
表格
主题	内容
数据流	DataInputStream / DataOutputStream 读写基本类型
对象流	ObjectInputStream / ObjectOutputStream
序列化	Serializable 接口、transient 关键字
序列化版本号	serialVersionUID 的作用
深拷贝	通过序列化实现对象深拷贝
注意事项	静态变量不序列化、自定义序列化方法
第六阶段：其他常用流
表格
主题	内容
打印流	PrintStream / PrintWriter、自动刷新
内存流	ByteArrayInputStream / ByteArrayOutputStream
字符数组流	CharArrayReader / CharArrayWriter
管道流	PipedInputStream / PipedOutputStream（线程通信）
随机访问流	RandomAccessFile、seek() 任意位置读写
标准流	System.in、System.out、System.err
第七阶段：NIO（New IO，进阶）
表格
主题	内容
NIO 核心	Channel、Buffer、Selector
Buffer	ByteBuffer、容量/限制/位置/标记
Channel	FileChannel、SocketChannel、ServerSocketChannel
非阻塞 IO	Selector 多路复用
NIO vs BIO	阻塞 vs 非阻塞、适用场景
NIO.2（Path/Files）	Path、Paths、Files 工具类
第八阶段：IO 设计模式与实战
表格
主题	内容
装饰器模式	IO 流的包装机制
适配器模式	InputStreamReader 字节流转字符流
实战项目	文件搜索工具、目录同步、日志系统
性能优化	缓冲区大小选择、零拷贝（transferTo）
 */