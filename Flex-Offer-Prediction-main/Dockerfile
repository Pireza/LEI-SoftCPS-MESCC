# ===== Stage 1: Builder =====
FROM python:3.13-slim AS builder

# Set working directory
WORKDIR /app

# Install system build dependencies (optional but useful for compiling some Python packages)
RUN apt-get update && apt-get install -y --no-install-recommends \
    build-essential \
 && rm -rf /var/lib/apt/lists/*

# Copy dependency list first (for better caching)
COPY requirements.txt .

# Install Python dependencies
RUN pip install --upgrade pip && \
    pip install --no-cache-dir -r requirements.txt

# ===== Stage 2: Final runtime image =====
FROM python:3.13-slim

WORKDIR /app

# Copy Python environment and code from builder
COPY --from=builder /usr/local /usr/local
COPY . .

# Set environment variables
ENV PYTHONUNBUFFERED=1 \
    PYTHONDONTWRITEBYTECODE=1

# Default command — replace "main.py" with your script’s entry point
# If your .bat file runs "python myscript.py", put that here
CMD ["python", "-m", "src.main"]
