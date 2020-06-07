all: compile run

default:
	if [ ! -d class ]; then mkdir class; fi;

compile: default
	javac src/*.java -d ./class

run: compile
	java -cp ./class DulceriaRosa

clean:
	rm -rf ./class
