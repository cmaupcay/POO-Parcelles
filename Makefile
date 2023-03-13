SRC = src
BUILD = build

JC = javac
JCFLAGS = -g -d $(BUILD) --source-path $(SRC)
JVM = java
JVMFALGS = -cp $(BUILD)

.SUFFIXES: .java .class

.java.class:
	@echo Compilation de $*...
	@-$(JC) $(JCFLAGS) $*.java ||:

CLASSES = \
	Application

SOURCES = $(addsuffix .java, $(addprefix $(SRC)/, $(CLASSES)))

default: clean classes run

classes: $(SOURCES:.java=.class)

MAIN = Application

run: classes
	@echo Démarrage de $(MAIN)...
	@-$(JVM) $(JVMFALGS) $(MAIN) ||:

clean:
	@-rm -rf $(BUILD) ||: