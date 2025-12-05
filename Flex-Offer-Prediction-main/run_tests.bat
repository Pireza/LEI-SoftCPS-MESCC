@echo off
REM Set the PYTHONPATH so src is recognized as the root module
set PYTHONPATH=src

REM Run pytest
pytest -vs --no-header --no-summary
