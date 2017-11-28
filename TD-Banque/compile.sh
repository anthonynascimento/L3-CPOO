#!/bin/bash

rm -rf bin
mkdir -p bin
cd TD-Banque/src
javac main/Main.java -d ../bin/
