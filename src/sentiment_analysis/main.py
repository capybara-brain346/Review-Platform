# Use a pipeline as a high-level helper
from transformers import pipeline

pipe = pipeline("text-classification", model="finiteautomata/bertweet-base-sentiment-analysis", device="cuda")
print(pipe("This restaurant is ok!"))
