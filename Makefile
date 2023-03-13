SRC = src
BUILD = build
BUILD_CLASS = $(BUILD)/class

JC = javac
JCFLAGS = -d $(BUILD_CLASS) --source-path $(SRC)
JVM = java
JVMFALGS = -cp $(BUILD_CLASS)

.SUFFIXES: .java .class

.java.class:
	@echo Compilation de $*...
	@-$(JC) $(JCFLAGS) $*.java ||:

MAIN = Application

SOURCES = $(BUILD)/sources.txt

$(SOURCES):
	@-mkdir -p $(BUILD)
	@-find $(SRC) -name "*.java" > $@

default: all

all: clean compile run

compile: $(SOURCES)
	@echo Compilation...
	@-$(JC) $(JCFLAGS) @$<

run: compile
	@echo Démarrage de $(MAIN)...
	@-$(JVM) $(JVMFALGS) $(MAIN) ||:

clean:
	@-rm -rf $(BUILD) ||: