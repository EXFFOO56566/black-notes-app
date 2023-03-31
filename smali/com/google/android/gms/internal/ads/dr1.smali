.class public final Lcom/google/android/gms/internal/ads/dr1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/fp1;


# static fields
.field private static final c:[B


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/uu1;

.field private final b:Lcom/google/android/gms/internal/ads/fp1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/google/android/gms/internal/ads/dr1;->c:[B

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ads/uu1;Lcom/google/android/gms/internal/ads/fp1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/dr1;->a:Lcom/google/android/gms/internal/ads/uu1;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/dr1;->b:Lcom/google/android/gms/internal/ads/fp1;

    return-void
.end method


# virtual methods
.method public final a([B[B)[B
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dr1;->a:Lcom/google/android/gms/internal/ads/uu1;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/bq1;->b(Lcom/google/android/gms/internal/ads/uu1;)Lcom/google/android/gms/internal/ads/c12;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/c12;->f()[B

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/dr1;->b:Lcom/google/android/gms/internal/ads/fp1;

    sget-object v2, Lcom/google/android/gms/internal/ads/dr1;->c:[B

    invoke-interface {v1, v0, v2}, Lcom/google/android/gms/internal/ads/fp1;->a([B[B)[B

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/dr1;->a:Lcom/google/android/gms/internal/ads/uu1;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/uu1;->p()Ljava/lang/String;

    move-result-object v2

    const-class v3, Lcom/google/android/gms/internal/ads/fp1;

    invoke-static {v2, v0, v3}, Lcom/google/android/gms/internal/ads/bq1;->a(Ljava/lang/String;[BLjava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/fp1;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ads/fp1;->a([B[B)[B

    move-result-object p1

    array-length p2, v1

    add-int/lit8 p2, p2, 0x4

    array-length v0, p1

    add-int/2addr p2, v0

    invoke-static {p2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p2

    array-length v0, v1

    invoke-virtual {p2, v0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object p2

    invoke-virtual {p2, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p1

    return-object p1
.end method
