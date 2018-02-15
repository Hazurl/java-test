SRC_DIR := src
BUILD_DIR := build

MAKEFLAGS += --no-print-directory

all: $(SRC_DIR) $(BUILD_DIR)

$(SRC_DIR):
	@mkdir ./$(SRC_DIR)

$(BUILD_DIR):
	@mkdir ./$(BUILD_DIR)

package: $(SRC_DIR) $(BUILD_DIR)
	@echo "Creating package "$(pkg)"..."
	@mkdir ./$(SRC_DIR)/$(pkg)

class: $(SRC_DIR) $(BUILD_DIR)
	@echo "Creating class "$(name) "in package "$(pkg)"..."
	@echo "package "$(pkg)";\n\n\
	/*\n\
	 * " $(name)\
	"\n\
	 */\n\
	public class" $(name) "{\n\
	\t\n\
	}" > ./$(SRC_DIR)/$(pkg)/$(name).java

compile: $(SRC_DIR) $(BUILD_DIR)
	@echo "Compiling package "$(pkg)"..."
	@javac -d ./$(BUILD_DIR) ./$(SRC_DIR)/$(pkg)/*.java

$(BUILD_DIR)/%:
	@make compile pkg=$*

run: $(SRC_DIR) $(BUILD_DIR) $(BUILD_DIR)/$(pkg)
	@java -cp ./$(BUILD_DIR) $(main)

clean: $(SRC_DIR) $(BUILD_DIR)
	rm -rf ./$(BUILD_DIR)/$(pkg)

again: $(SRC_DIR) $(BUILD_DIR)
	@make clean pkg=$(pkg)
	@make compile pkg=$(pkg)

again-run: $(SRC_DIR) $(BUILD_DIR)
	@make clean pkg=$(pkg)
	@make compile pkg=$(pkg)
	@make run pkg=$(pkg) main=$(main)