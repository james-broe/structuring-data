snake = input()
snakey = list(snake)
print(snakey)

i = 0;
while(1):
    if (snakey[i] == '_'):
        snakey2 = []
        for j in range(0,i):
            snakey2.append(j)
        for j in range(i+1,snakey):
            print(snakey)
    i += 1
