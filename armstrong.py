while True:
    girdi = input('Please enter a positive number to see if the number you entered is an Armstrong number : ')
    if int(girdi) < 0:
        print(" Please enter a positive number")
    elif ("," in girdi) or ("." in girdi):
        print(" Please enter an integer number")
    elif not girdi.isnumeric():
        print("Do not use any entries other than numeric values")
    else:
        for i in range(len(girdi)):
            toplam += int(girdi[i]) ** (len(girdi))
        if int(girdi) == int(toplam):
            print(girdi+" is an Armstrong number")
        else:
            print(girdi+" is not an Armstrong number")