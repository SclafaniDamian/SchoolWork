.data
	num1: .word 0
	num2: .word 0
	newline: .asciiz "\n"
	message: .asciiz "Type in two numbers"
.text
main:
    	#print message
	addi $v0, $zero, 4
	la $a0, message
	syscall
    	
    	#read two numbers
    	li $v0, 5 	#system call code for reading integer
    	syscall
    	sw $v0, num1 	#store first number
    	li $v0, 5
    	syscall
    	sw $v0, num2 	#store second number

    	#print out the two numbers
    	li $v0, 1 	#system call code for printing integer
    	lw $a0, num1 	#load first number
    	syscall
    	li $v0, 1
    	lw $a0, num2 	#load second number
    	syscall

    	#print out the &, |, and ^ of the two numbers
    	lw $t0, num1
    	lw $t1, num2
    	and $t2, $t0, $t1 	#$t2 = $t0 & $t1
    	li $v0, 1
    	move $a0, $t2 		#load & result
    	syscall
    	or $t2, $t0, $t1 	#$t2 = $t0 | $t1
    	li $v0, 1
    	move $a0, $t2 		#load | result
    	syscall
    	xor $t2, $t0, $t1 	#$t2 = $t0 ^ $t1
    	li $v0, 1
    	move $a0, $t2 		#load ^ result
    	syscall

    	#print out the <<, >>, and ~ for each of the numbers
    	lw $t0, num1
    	li $v0, 1
    	sll $t1, $t0, 2 	#$t1 = $t0 << 2
    	move $a0, $t1 		#load << result
    	syscall
    	srl $t1, $t0, 2 	#$t1 = $t0 >> 2
    	move $a0, $t1 		#load >> result
    	syscall
    	not $t1, $t0 		#$t1 = ~$t0
    	move $a0, $t1 		#load ~ result
    	syscall

    	lw $t0, num2
    	li $v0, 1
    	sll $t1, $t0, 2 	#$t1 = $t0 << 2
    	move $a0, $t1 		#load << result
    	syscall
    	srl $t1, $t0, 2 	#$t1 = $t0 >> 2
    	move $a0, $t1 		#load >> result
    	syscall
    	not $t1, $t0 		#$t1 = ~$t0
    	move $a0, $t1 		#load ~ result
    	syscall

    	li $v0, 10 		#system call code for exit
    	syscall

Exit:
	li $v0, 10
	syscall

nl:
	#new line
	li $v0, 4
	la $a0, newline
	syscall
	jr $ra
