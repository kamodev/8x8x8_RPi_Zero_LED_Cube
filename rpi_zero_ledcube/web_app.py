"""
The application file for the package
"""
from flask import Flask, render_template, jsonify
from cube import cube

app = Flask(__name__, template_folder='server/templates')


@app.route("/")
def index():
    template_data = {
      'site_title' : '8x8x8 LED Cube Operations',
      'page_title' : 'LED Cube Control Panel'
    }

    return render_template('layout.html', **template_data)


@app.route("/about")
def about():
    template_data = {
      'site_title' : '8x8x8 LED Cube Operations',
      'page_title' : 'LED Cube v1.0'
    }

    return render_template('about.html', **template_data)


@app.route("/cube-status", methods=['GET'])
def cube_status():

    return jsonify(cube.status())

if __name__ == "__main__":
    app.run(host='0.0.0.0', port=8080, debug=True)