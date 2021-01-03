#fila=[] 
#First In First Out: FIFO

#pilha=[]
#First In Last Out: FILO

while true:
    
 a= input()
 if a==0:
    break

 pilha = range(1,a+1)
 pilha =pilha[::-1]
 cartas_jogadas=[]
 while len(pilha)>1:
     cartas_jogadas.append(str(pilha.pop()))
     pilha.insert(0,pilha.pop())
 print("Discarde cards:")