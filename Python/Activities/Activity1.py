name=input("What is your name:")
age=int(input("What is your age:"))
result= name + " will be 100 in another {} years"
print(result.format(100-age))
year=str((2022-age)+100)
print(name+ "turns 100 in year" +year)