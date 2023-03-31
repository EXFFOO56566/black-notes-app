.class public final enum Lcom/google/android/gms/internal/ads/zk2$c;
.super Ljava/lang/Enum;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/tz1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ads/zk2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/android/gms/internal/ads/zk2$c;",
        ">;",
        "Lcom/google/android/gms/internal/ads/tz1;"
    }
.end annotation


# static fields
.field public static final enum c:Lcom/google/android/gms/internal/ads/zk2$c;

.field public static final enum d:Lcom/google/android/gms/internal/ads/zk2$c;

.field public static final enum e:Lcom/google/android/gms/internal/ads/zk2$c;

.field private static final synthetic f:[Lcom/google/android/gms/internal/ads/zk2$c;


# instance fields
.field private final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/google/android/gms/internal/ads/zk2$c;

    const/4 v1, 0x0

    const-string v2, "NETWORKTYPE_UNSPECIFIED"

    invoke-direct {v0, v2, v1, v1}, Lcom/google/android/gms/internal/ads/zk2$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zk2$c;->c:Lcom/google/android/gms/internal/ads/zk2$c;

    new-instance v0, Lcom/google/android/gms/internal/ads/zk2$c;

    const/4 v2, 0x1

    const-string v3, "CELL"

    invoke-direct {v0, v3, v2, v2}, Lcom/google/android/gms/internal/ads/zk2$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zk2$c;->d:Lcom/google/android/gms/internal/ads/zk2$c;

    new-instance v0, Lcom/google/android/gms/internal/ads/zk2$c;

    const/4 v3, 0x2

    const-string v4, "WIFI"

    invoke-direct {v0, v4, v3, v3}, Lcom/google/android/gms/internal/ads/zk2$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zk2$c;->e:Lcom/google/android/gms/internal/ads/zk2$c;

    const/4 v4, 0x3

    new-array v4, v4, [Lcom/google/android/gms/internal/ads/zk2$c;

    sget-object v5, Lcom/google/android/gms/internal/ads/zk2$c;->c:Lcom/google/android/gms/internal/ads/zk2$c;

    aput-object v5, v4, v1

    sget-object v1, Lcom/google/android/gms/internal/ads/zk2$c;->d:Lcom/google/android/gms/internal/ads/zk2$c;

    aput-object v1, v4, v2

    aput-object v0, v4, v3

    sput-object v4, Lcom/google/android/gms/internal/ads/zk2$c;->f:[Lcom/google/android/gms/internal/ads/zk2$c;

    new-instance v0, Lcom/google/android/gms/internal/ads/am2;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/am2;-><init>()V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/google/android/gms/internal/ads/zk2$c;->b:I

    return-void
.end method

.method public static a(I)Lcom/google/android/gms/internal/ads/zk2$c;
    .locals 1

    if-eqz p0, :cond_2

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, Lcom/google/android/gms/internal/ads/zk2$c;->e:Lcom/google/android/gms/internal/ads/zk2$c;

    return-object p0

    :cond_1
    sget-object p0, Lcom/google/android/gms/internal/ads/zk2$c;->d:Lcom/google/android/gms/internal/ads/zk2$c;

    return-object p0

    :cond_2
    sget-object p0, Lcom/google/android/gms/internal/ads/zk2$c;->c:Lcom/google/android/gms/internal/ads/zk2$c;

    return-object p0
.end method

.method public static b()Lcom/google/android/gms/internal/ads/vz1;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/bm2;->a:Lcom/google/android/gms/internal/ads/vz1;

    return-object v0
.end method

.method public static values()[Lcom/google/android/gms/internal/ads/zk2$c;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zk2$c;->f:[Lcom/google/android/gms/internal/ads/zk2$c;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/ads/zk2$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/ads/zk2$c;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zk2$c;->b:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "<"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-class v1, Lcom/google/android/gms/internal/ads/zk2$c;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " number="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/google/android/gms/internal/ads/zk2$c;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
