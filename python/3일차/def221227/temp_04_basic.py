# -*- coding: utf-8 -*-

# context manager 작성
import contextlib
import sqlite3
from contextlib import asynccontextmanager
# context 매니저 패턴
# open / close
# Lock / Release
# Change / Reset
# Enter / Exit
# Start / Stop
# Setup / Teardown
# Connect / Disconnect

@contextlib.contextmanager ## 동기화
def db_coonect(url):

    db = sqlite3.connect(url)
    yield db

    db.close()

def main():
    url = None
    db_coonect(url)

@asynccontextmanager ## 비동기화
def db_coonect(url):

    db = sqlite3.connect(url)
    yield db

    db.close()

def main():
    url = None
    db_coonect(url)