

JAVA_PATH = C:\\Program Files\\Java\\jdk1.7.0_80\\bin\\
SOURCE_PATH = D:\\Vinh_WorkSpace\\Test01\\
CLASS_PATH = $(SOURCE_PATH)bin\\
DEMO = D:\\Vinh_WorkSpace\\Test01\\

#JAVA_PATH = /usr/lib/jvm/default-java/bin/
#SOURCE_PATH = /home/picachu/Documents/Workspace/Test01/
#CLASS_PATH = $(SOURCE_PATH)bin/
.DEFAULT_GOAL = build

.PHONY : run
run: 
	$(JAVA_PATH)java -cp ./bin -Duser.language=en -Duser.country=US  Test01 

#-J-Duser.language=en
.PHONY :  build
build: 
	$(JAVA_PATH)javac -d ./bin -cp .  Test01.java -encoding utf-8 -Xlint:unchecked -J-Duser.language=en

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
	$(JAVA_PATH)jar cvfm first_jar.jar manifes.txt test01 lib test02 test03 test04 Test01.class test05 image
.PHONY : jarrun
jarrun:	
	$(JAVA_PATH)java -jar first_jar.jar -Duser.language=en -Duser.country=US
	
.PHONY : test01
test01: ;$(JAVA_PATH)java -Duser.language=en -Duser.country=US

#java -Duser.language=en -Duser.country=US Default

.PHONY :  build002
build002: 
		$(JAVA_PATH)javac -d ./bin -cp . lib/file/File_VinhNT.java -encoding utf-8 -Xlint:unchecked -J-Duser.language=en
	$(JAVA_PATH)javac -d ./bin -cp .  test05/Test05_JFrame.java -encoding utf-8 -Xlint:unchecked -J-Duser.language=en


#	$(JAVA_PATH)javac -d ./bin -cp .  test05/Test05_JFrame.java -encoding utf-8 -Xlint:unchecked -J-Duser.language=en
#	$(JAVA_PATH)javac -d ./bin -cp . lib/layout/PicachuLayout.java -encoding utf-8 -Xlint:unchecked -J-Duser.language=en
#	$(JAVA_PATH)javac -d ./bin -cp . lib/file/File_VinhNT.java -encoding utf-8 -Xlint:unchecked -J-Duser.language=en


