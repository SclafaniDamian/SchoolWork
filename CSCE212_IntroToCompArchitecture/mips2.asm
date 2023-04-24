#print hello world
.data
	test: .asciiz "Hello World!"
.text
	addi $v0, $zero, 4
	#li $v0
	#load address
	la $a0, test
	
	syscall
	
	li $v0, 1
	li $a0, 10
	syscall
	