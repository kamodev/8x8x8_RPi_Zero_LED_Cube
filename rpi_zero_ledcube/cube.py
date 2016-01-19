class cube():

    CUBE_STATUS = "Off"
    PATTERN = "Hello"

    def __init__(self):
        pass

    @staticmethod
    def status():
        """
        Return dictionary of details about the cube
        :return: Dictionary
        """
        return {
            'pattern': cube.PATTERN,
            'status': cube.CUBE_STATUS
        }
