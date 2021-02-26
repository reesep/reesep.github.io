# --------------------------------------
# CSCI 127: Joy and Beauty of Data
# MatPlotLib Introductory Example
# --------------------------------------

import matplotlib.pyplot as plt
import numpy as np

# --------------------------------------

def plot_line(x1, y1, x2, y2):
    ## x1 = -100 y1 = -100 x2 = 100 y= 100
    """Plot a line using the specified points."""
    x = [x1, x2]
    y = [y1, y2]
    plt.plot(x, y, "gold")
    

# --------------------------------------

def plot_sine_wave(start_x, stop_x, amplitude):
    """Plot a sine wave."""
    x_array = np.linspace(start_x, stop_x, 1000)
    print(x_array)
    y_array = amplitude * np.sin(x_array)
    plt.plot(x_array, y_array,":",color="red")

# --------------------------------------

def main(graph_min, graph_max):
    
    plt.xlim(graph_min, graph_max)
    plt.ylim(graph_min, graph_max)

    plot_line(graph_min, graph_min, graph_max, graph_max)
    
    x_array = np.array([graph_min, graph_max])
    y_array = np.array([graph_max, graph_min])
    plt.plot(x_array, y_array, "blue")
    
    plot_sine_wave(graph_min // 2, graph_max // 2, graph_max // 4)

    plt.show()

# --------------------------------------

main(-100, 100)
