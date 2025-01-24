public class DessinHTMLer {
    private static final String debutHTML = "<html lang=\"en\">\n" +
            "<body>\n" +
            "<canvas id=\"canvas\" width=\"1500\" height=\"1500\"></canvas>\n" +
            "</body>\n" +
            "\n" +
            "<script>\n" +
            "    function draw() {\n" +
            "        const canvas = document.getElementById(\"canvas\");\n" +
            "        if (canvas.getContext) {\n" +
            "            const ctx = canvas.getContext(\"2d\");";


    private static final String finHTML = "}\n" +
            "    }\n" +
            "\n" +
            "    function clearDraw(){\n" +
            "        const canvas = document.getElementById(\"canvas\");\n" +
            "        if (canvas.getContext) {\n" +
            "            const ctx = canvas.getContext(\"2d\");\n" +
            "            ctx.clearRect(0, 0, canvas.width, canvas.height);\n" +
            "\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "    function drawCircle(ctx, x, y, radius, fillColor, strokeColor){\n" +
            "        ctx.beginPath();\n" +
            "        ctx.arc(x, y, radius, 0, Math.PI * 2); // (x, y, radius, startAngle, endAngle)\n" +
            "        ctx.fillStyle = fillColor; // Set fill color\n" +
            "        ctx.fill(); // Fill the circle\n" +
            "        ctx.strokeStyle = strokeColor; // Set stroke color\n" +
            "        ctx.lineWidth = 2;\n" +
            "        ctx.stroke(); // Draw border\n" +
            "    }\n" +
            "\n" +
            "    function drawEquilateralTriangle(ctx, x, y, side, fillColor, strokeColor) {\n" +
            "        const height = (Math.sqrt(3) / 2) * side; // Calculate height of triangle\n" +
            "\n" +
            "        // Define the three vertices\n" +
            "        const x1 = x;\n" +
            "        const y1 = y;\n" +
            "        const x2 = x - side / 2;\n" +
            "        const y2 = y + height;\n" +
            "        const x3 = x + side / 2;\n" +
            "        const y3 = y + height;\n" +
            "\n" +
            "        // Draw the triangle\n" +
            "        ctx.beginPath();\n" +
            "        ctx.moveTo(x1, y1); // Top vertex\n" +
            "        ctx.lineTo(x2, y2); // Bottom left\n" +
            "        ctx.lineTo(x3, y3); // Bottom right\n" +
            "        ctx.closePath();\n" +
            "\n" +
            "        // Fill and stroke\n" +
            "        ctx.fillStyle = fillColor;\n" +
            "        ctx.fill();\n" +
            "        ctx.strokeStyle = strokeColor;\n" +
            "        ctx.lineWidth = 2;\n" +
            "        ctx.stroke();\n" +
            "    }\n" +
            "\n" +
            "    draw();\n" +
            "</script>\n" +
            "</html>\n";


    public static void transformerDessinEnPageWeb(Dessin d){
        String html = debutHTML + d.toHTMLCanvas() + finHTML;
        UtilsHTML.writeHTMLToIndex(html);
    }

    public static void main(String[] args) {
        int nbFormes = 10;
        Dessin d = UtlisDrawGenerator.genereRandomDessin(nbFormes);
        transformerDessinEnPageWeb(d);
    }

}
