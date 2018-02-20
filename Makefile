SRC_DIR := src
BUILD_DIR := build

MAKEFLAGS += --no-print-directory

all: $(SRC_DIR) $(BUILD_DIR)

$(SRC_DIR):
	@mkdir ./$(SRC_DIR)

$(BUILD_DIR):
	@mkdir ./$(BUILD_DIR)

package: $(SRC_DIR) $(BUILD_DIR)
ifndef pkg
	$(error "Package's name not defined (use pkg='...')")
endif
	@echo "Creating package "$(pkg)"..."
	@mkdir ./$(SRC_DIR)/$(pkg)

class: $(SRC_DIR) $(BUILD_DIR)
ifndef pkg
	$(error "Package's name not defined (use pkg='...')")
endif
ifndef name
	$(error "Class's name not defined (use name='...')")
endif
	@echo "Creating class "$(name) "in package "$(pkg)"..."
	@echo "package "$(pkg)";\n\n\
	/*\n\
	 * " $(name)\
	"\n\
	 */\n\
	public class" $(name) "{\n\
	\t\n\
	}" > ./$(SRC_DIR)/$(pkg)/$(name).java

compile: $(SRC_DIR) $(BUILD_DIR) $(patsubst %.java, %.class, $(wildcard ./$(SRC_DIR)/$(pkg)/*.java))
ifndef pkg
	$(error "Package's name not defined (use pkg='...')")
endif

%.class: %.java $(SRC_DIR) $(BUILD_DIR)
	@echo "Compiling class "$(notdir $<)"..."
	@javac -d ./$(BUILD_DIR) -cp ./$(BUILD_DIR) -cp ./$(SRC_DIR) $<


$(BUILD_DIR)/%:
	@make compile pkg=$*

run: $(SRC_DIR) $(BUILD_DIR) $(BUILD_DIR)/$(pkg)
ifndef pkg
	$(error "Package's name not defined (use pkg='...')")
endif
ifndef main
	$(error "Main not defined (use main='...')")
endif
	@java -cp ./$(BUILD_DIR) $(pkg).$(main)

clean: $(SRC_DIR) $(BUILD_DIR)
ifndef pkg
	@echo "Cleaning build folder..."
else
	@echo "Cleaning Package "$(pkg)"..."
endif
	@rm -rf ./$(BUILD_DIR)/$(pkg)

again: $(SRC_DIR) $(BUILD_DIR)
ifndef pkg
	$(error "Package's name not defined (use pkg='...')")
endif
	@make clean pkg=$(pkg)
	@make compile pkg=$(pkg)

again-run: $(SRC_DIR) $(BUILD_DIR)
ifndef pkg
	$(error "Package's name not defined (use pkg='...')")
endif
ifndef main
	$(error "Main not defined (use main='...')")
endif
	@make clean pkg=$(pkg)
	@make compile pkg=$(pkg)
	@make run pkg=$(pkg) main=$(pkg).$(main)