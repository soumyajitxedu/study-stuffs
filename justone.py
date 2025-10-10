#Write a Python program that defines a correct password as "python123". The program should use a while loop to repeatedly ask the user to input a password until the entered password matches the correct one. Once the correct password is entered, print a success message and exit the loop.correct_password = "python123"
import pandas as pd
import numpy as np 
correct_ps = "python123"
user_ps =""
while user_ps != correct_ps:
    user_ps = input("enter your password")
if user_ps == correct_ps:
    print("unlock password , welcome")
else:
    print("incorrect pasword")

