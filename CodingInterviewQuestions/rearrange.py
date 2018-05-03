# Python is so much simpler than java...

x = input()
list = []

while x != "-1":

    line = x.split(' ')
    line[0] = int(line[0])
    list.append(line)
    x = input()

list = sorted(list, key=lambda x: x[0])

for a in list:
    print("%d %s" % (a[0], a[1]))
