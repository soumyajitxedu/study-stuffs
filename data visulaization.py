import pandas as pd
import matplotlib.pyplot as plt
import numpy as np

df = pd.read_csv(r'C:\Users\maina\Downloads\soumyajit drive\codeverse\Content 2023-06-09_2025-09-30 Soumyajit Das\Table data.csv')

# Select numeric columns for visualization
numeric_cols = df.select_dtypes(include=np.number).columns

# Create a color gradient
colors = plt.cm.viridis(np.linspace(0, 1, len(numeric_cols)))

plt.figure(figsize=(12, 6))
for idx, col in enumerate(numeric_cols):
    plt.plot(df.index, df[col], label=col, color=colors[idx], linewidth=2)

plt.title('Wave Graphs of Complex Data')
plt.xlabel('Index')
plt.ylabel('Value')
plt.legend()
plt.grid(True, alpha=0.3)
plt.tight_layout()
plt.show()
