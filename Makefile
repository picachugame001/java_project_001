

#JAVA_PATH = C:\\Program Files\\Java\\jdk1.7.0_80\\bin\\
#SOURCE_PATH = D:\\Workspaces\\Java\\Test01\\
#CLASS_PATH = $(SOURCE_PATH)bin\\

JAVA_PATH = /usr/lib/jvm/default-java/bin/
SOURCE_PATH = /home/picachu/Documents/Wordspaces/java/Test01/
CLASS_PATH = $(SOURCE_PATH)bin/
.DEFAULT_GOAL = run

.PHONY : run
run: build
	$(JAVA_PATH)java -cp $(CLASS_PATH)  Test01

.PHONY :  build
build: 
	$(JAVA_PATH)javac -d $(CLASS_PATH) -cp .  Test01.java -encoding utf-8 -Xlint:unchecked

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
	$(JAVA_PATH)jar cvfm first_jar.jar manifes.txt test01 lib test02 test03 test04 Test01.class
.PHONY : jarrun
jarrun:	
	$(JAVA_PATH)java -jar first_jar.jar

