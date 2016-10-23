

JAVA_PATH = C:\\Program Files\\Java\\jdk1.7.0_80\\bin\\
SOURCE_PATH = D:\\Workspaces\\Java\\Test01\\
CLASS_PATH = $(SOURCE_PATH)bin\\

#JAVA_PATH = /usr/lib/jvm/default-java/bin/
#SOURCE_PATH = /media/picachu/AACD4A0B2C53D4EA/Workspaces/Java/Test01/
#CLASS_PATH = $(SOURCE_PATH)bin/

.PHONY : run
run: build
	$(JAVA_PATH)java -cp $(CLASS_PATH)  test01.Test02

.PHONY :  build
build: 
	$(JAVA_PATH)javac -d $(CLASS_PATH) -cp .  test01/Test02.java -encoding utf-8

.PHONY : test
test:
	$(JAVA_PATH)javac
.PHONY : set_path	
set_path:
	set CLASSPATH=D:\Workspaces\Java\Test01_bin\
	
.PHONY : doc
doc:
	$(JAVA_PATH)javadoc -private -sourcepath $(SOURCE_PATH) \
	Test01.java \
	-d ./docs/ \
	-overview $(SOURCE_PATH)docs\\over_view.html \
	-subpackages lib
# tao jar file
.PHONY : jar
jar:
	jar cvfm first_jar.jar manifes.txt bin/test01/Test02.class bin/test01/ bin/lib/
.PHONY : jarrun
jarrun:	
	java -jar first_jar.jar
