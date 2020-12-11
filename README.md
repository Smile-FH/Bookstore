# BootBookStore
学习SpringBoot时写的一个小demo

2020年7月18日
学习时候的最大感受就是：程序报错的话，永远都是'附件'写错了。例如：报了mybatis的错，好，那就是mybatis的映射文件写错了，不用找别的，看你的mapper文件就好。
1. Mapper映射问题
    在Mapper文件中映射entity/domain/pojo/javaBean时，应该注意的问题：
    1. resultMap映射实体类的时候，子元素标签用的是result，别用其他的，映射主键的时候用id标签。
    2. 写sql语句的时候，标签上需要用到resultMap时，直接在标签上打上resultMap属性，不要错写成resultType属性了。
    3. mybatis的jdbcType属性是有范围的，
	        JdbcType            Oracle	          MySql
|JdbcType|	BIGINT	            	              BIGINT
|JdbcType|	BINARY	               	 
|JdbcType|	BIT	 	            BIT
|JdbcType|	BLOB	            BLOB	          BLOB
|JdbcType|	BOOLEAN	    	 
|JdbcType|	CHAR	            CHAR	          CHAR
|JdbcType|	ARRAY	    	 
|JdbcType|	CLOB              	CLOB              修改为TEXT
|JdbcType|	CURSOR	    	 
|JdbcType|	DATE	            DATE	          DATE
|JdbcType|	DECIMAL	            DECIMAL	          DECIMAL
|JdbcType|	DOUBLE	            NUMBER	          DOUBLE
|JdbcType|	FLOAT	            FLOAT             FLOAT
|JdbcType|	INTEGER	            INTEGER           INTEGER
|JdbcType|	LONGVAR             BINARY	 	 
|JdbcType|	LONGVAR             CHAR	          LONG VARCHAR	 
|JdbcType|	NCHAR	            NCHAR	 
|JdbcType|	NCLOB            	NCLOB	 
|JdbcType|	NULL	 	 
|JdbcType|	NUMERIC     	    NUMERIC/NUMBER	  NUMERIC/
|JdbcType|	NVARCHAR	 	 
|JdbcType|	OTHER	 	 
|JdbcType|	REAL	            REAL	          REAL
|JdbcType|	SMALLINT	        SMALLINT	      SMALLINT
|JdbcType|	STRUCT	 	 
|JdbcType|	TIME	 	        TIME
|JdbcType|	TIMESTAMP	        TIMESTAMP	      TIMESTAMP/DATETIME
|JdbcType|	TINYINT	 	        TINYINT
|JdbcType|	UNDEFINED	 	 
|JdbcType|	VARBINARY	 	 
|JdbcType|	VARCHAR	            VARCHAR           	VARCHAR


2020年7月27日
1. 发现的问题
    1. home页面中的搜索框中，按钮高度和搜索框高度不统一问题，按钮位置没有和搜索框的右边贴合问题
    子元素继承父元素高度问题：
        给父元素一个相对定位
        子元素设置绝对定位后高度100%即可
    要想和父元素贴合，只需要给绝对定位的子元素右边为0就好
