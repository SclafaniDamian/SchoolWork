.data
	A: .space 20

.text
	la $t0, A
	
	li $t1, 5
	sw $t1, 0($t0)
	
	li $t1, 3
	sw $t1, 4($t0)
	
	li $t1, 1
	sw $t1, 8($t0)
	
	li $t1, 12
	sw $t1, 12($t0)
	
	li $t1, 15
	sw $t1, 16($t0)
	
	move $a0, $t0
	jal example
	
exit:
	li $v0, 10
	syscall
	
example:
	#save environment
	addi $sp, $sp, -16
	sw $s0, 0($sp)
	sw $t0, 4($sp)
	sw $t1, 8($sp)
	sw $t2, 12($sp)
	
	move $s0, $a0
	li $t0, 0
	li $t1, 5

loop:
	bge $t0, $t1, funcexit
	
	sll $t2, $t0, 2
	add $t2, $t2, $s0
	lw $a0, 0($t2)
	li $v0, 1
	syscall
	
	#newline
	
	addi $t0, $t0, 1
	j loop
	
funcexit:
	lw $s0, 0($sp)
	lw $t0, 4($sp)
	lw $t1, 8($sp)
	lw $t2, 12($sp)
	addi $sp, $sp, 16
	jr $ra




