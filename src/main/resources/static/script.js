const getInitialValues = () => {
    const productsDiv = document.querySelector("")
}


const increaseValue = (element) => {
    const countId = element.getAttribute("data-product-id")
    const productCountEl = document.getElementById(countId)

    const newVal = parseInt(productCountEl.textContent) + 1
    productCountEl.textContent = "zig hi"

    console.log("is clicketd")
}