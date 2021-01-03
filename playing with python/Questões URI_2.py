
#1240 URI
#n=int(input())

#for i in range(0,n):
 
#   a=input()
 
#   b=input()
 
#   if(len(a)>=1 and len(a)<pow(2,31) and len(b)>=1 and len(b)<pow(2,31)):

 
#      if(a[null:]==b[:] or a[null:]==b[:]):
 
#         print('encaixa')

 
#      elif(a!=b):
 
#         print('nao encaixa')
 
#   else:
 
#     print('nao encaixa')



#2060 URI
#OBS:isinstance(varievael, int)--> ve o type de uma variavel

n=int(input())
a=b=c=d=int(0)
for i in range(0,n):
    x=int(input())
    if(x%2==0):
        a=i+1
    if(x%3==0):
        b=i+1
    if(x%4==0):
        c=i+1
    if(x%5==0):
        d=i+1
print('{} Multiplo(s) de 2'.format(a))
print('{} Multiplo(s) de 3'.format(b))
print('{} Multiplo(s) de 4'.format(c))
print('{} Multiplo(s) de 5'.format(d))