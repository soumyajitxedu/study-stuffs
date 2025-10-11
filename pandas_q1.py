#Using the Pandas library, create a DataFrame named data_df with the following data:
#| Employee | Salary | Department |
#| :---: | :---: | :---: |
#| Alice | 50000 | Sales |
#| Charlie | 45000 | Sales |
#| David | 80000 | IT |
import pandas as pd
data = {
    'Employee': ['Alice', 'Bob', 'Charlie', 'David'],
    'Salary': [50000, 65000, 45000, 80000],
    'Department': ['Sales', 'IT', 'Sales', 'IT']
}
df_data = pd.DataFrame(data)
print(df_data)