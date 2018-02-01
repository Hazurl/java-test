clean:
	rm -rf ./build/
	mkdir build

cm1:
	javac -d build ./src/cm/TD1/**/*.java ./src/cm/TD1/*.java

cm1-run:
	java -cp build cm.TD1.Main

cm2:
	javac -d build ./src/cm/TD2/**/*.java ./src/cm/TD2/*.java

cm2-run:
	java -cp build cm.TD2.Main

tp1:
	javac -d build ./src/tp/TP1/**/*.java ./src/tp/TP1/*.java

tp1-run:
	java -cp build tp.TP1.Main
