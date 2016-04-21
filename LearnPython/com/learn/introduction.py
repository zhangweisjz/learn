# -*- coding: utf-8 -*-

class Introduction(object):

    def __init__(self):
        pass



    def Sai(self):
        while True:
            question = raw_input("Please ask you question: ")

            if "name" in question:
                print "My name is Zhang Wei"

            if "English" in question:
                print "You can also call me Sai"

            if "job" in question:
                print "I am a programmer, and I have done programming about Java, JavaScript, Database, Big Data etc."

            if "hobby" in question:
                print "I like playing badminton, running. I have run Shanghai full marathon for twice."

            if "dream" in question:
                print "My dream is that I can write a program and used by people in the world"


    def gougu(self):
        for i in range (1, 5):
            for m in range (1, 5):
                value = i* i + m * m
                target = 5* 5
                if value == 5*5:
                    print "x is " + str(i), "y is " + str(m)

    def cal(self):
        n = raw_input('Please input')
        target = 0
        for i in range(1, int(n)+1):
            target = target + i
        print target


intro = Introduction()


intro.cal()

#intro.gougu()
