#fila=[]
#PRIMEIRO A ENTRAR É O PRIMEIRO A SAIR
#pilha=[]
#PRIMEIRO A ENTRAR É O ULTIMO A SAIR

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


 
 
