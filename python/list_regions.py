import boto3
import os

region = os.environ["AWS_REGION"]

print(f"Using AWS Region: {region}")

ec2 = boto3.client("ec2", region_name=region)

response = ec2.describe_regions()

for region_data in response["Regions"]:
    print(region_data["RegionName"])