.class public final La/g/d/c/c$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La/g/d/c/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/g/d/c/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field private final a:La/g/i/a;

.field private final b:I

.field private final c:I


# direct methods
.method public constructor <init>(La/g/i/a;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/g/d/c/c$d;->a:La/g/i/a;

    iput p2, p0, La/g/d/c/c$d;->c:I

    iput p3, p0, La/g/d/c/c$d;->b:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, La/g/d/c/c$d;->c:I

    return v0
.end method

.method public b()La/g/i/a;
    .locals 1

    iget-object v0, p0, La/g/d/c/c$d;->a:La/g/i/a;

    return-object v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, La/g/d/c/c$d;->b:I

    return v0
.end method
