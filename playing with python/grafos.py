#2300 URI
def bfs(matriz,origem,v):
    visitados = [0 for i in range(v+1)]
    fila=[origem]

    while len(fila)>0:
        atual = fila[0]
        del fila[0]

        for vizinho in range(v+1):
            if matriz[atual][vizinho]== 1 and visitados [vizinho]==
               fila.append(vizinho)
               visitados[vizinho]=1

    indice=1
    while         

while true:
 entrada=map(int, input().split())
 v=entrada[0]
 a=entrada[1]
 if v==0 and a==0:
    break
 matriz=[[0 for i in range(v+1)] for j in range(v+1)]
 for i in range(a):
    e= map(int, input().split())
    x=e[0]
    y=e[1]
    matriz[x][y]=1
    matriz[y][x]=1