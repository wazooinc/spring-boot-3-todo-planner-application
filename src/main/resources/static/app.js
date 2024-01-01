

const onHandleListItemClick = async (id) => {
    console.log('click ', id)

    const options = {
        method: 'PUT',
        headers: { 'Content-Type': 'application/json' },
        body: {}
    }
    const response = await fetch(`/todos/${id}`, options)
    const data = await response.json()
    console.log('data', data)
    window.location.reload()
}

$(() => {
    console.log('jquery ready')
})