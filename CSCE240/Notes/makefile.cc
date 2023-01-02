# this is the comment symbol in a makefile
# target : prerequisite/dependencies
# $@ target
# $< first prerequisite
# $^ all prerequisites
flags = -std=c++17 -Wall -I .
triangles.o : triangles.cc triangles.h
	g++ $(flags) -c $<

test_IsTriangleSides.o : test_IsTriangleSides.cc triangles.h
	g++ $(flags) -c $<

test_IsTriangleSides : test_IsTriangleSides.o triangles.o
	g++ $(flags) $^ -o $@

test_IsScaleneTriangleSides.o : test_IsScaleneTriangleSides.cc triangles.h
	g++ $(flags) -c $<

test_IsScaleneTriangleSides : test_IsScaleneTriangleSides.o triangles.o
	g++ $(flags) $^ -o $@

test : test_isTriangleSides test_IsScaleneTriangleSides
	./test_IsTriangleSides
	./test_IsScaleneTriangleSides

clean :
	rm *.o test_IsTriangleSides
