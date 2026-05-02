CXX = c++
CXXFLAGS = -std=c++11
SRC_DIR = src
OUT_DIR = out

EXERCISES = $(basename $(notdir $(wildcard $(SRC_DIR)/*.cpp)))
BINARIES = $(addprefix $(OUT_DIR)/,$(addsuffix .out,$(EXERCISES)))

all: $(BINARIES)

$(OUT_DIR)/%.out: $(SRC_DIR)/%.cpp | $(OUT_DIR)
	$(CXX) $(CXXFLAGS) $< -o $@

$(OUT_DIR):
	mkdir -p $(OUT_DIR)

clean:
	rm -rf $(OUT_DIR)

.PHONY: all clean
