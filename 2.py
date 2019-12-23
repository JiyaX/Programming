n=int(input())
l=[]

for i in range(0,n):
    a=int(input())
    l.append(a)
    
for i in l:
  a=i/12
  c=i%12
  c1=6-c
  c1=abs(c1)
  
  if c>6 or c==0:
      d=-1
  else :
      d=1
  z=i+1+(d*(2*c1))
  print(z,end=' ')
  l=z%6  
  if l==0 or l==1:
      print("WS")
  elif l==2 or l==5:
      print("MS")
  else:
      print("AS")
