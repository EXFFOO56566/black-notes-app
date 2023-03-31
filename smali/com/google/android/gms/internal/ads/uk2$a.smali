.class public final enum Lcom/google/android/gms/internal/ads/uk2$a;
.super Ljava/lang/Enum;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/tz1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ads/uk2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/android/gms/internal/ads/uk2$a;",
        ">;",
        "Lcom/google/android/gms/internal/ads/tz1;"
    }
.end annotation


# static fields
.field private static final enum c:Lcom/google/android/gms/internal/ads/uk2$a;

.field private static final enum d:Lcom/google/android/gms/internal/ads/uk2$a;

.field private static final enum e:Lcom/google/android/gms/internal/ads/uk2$a;

.field private static final synthetic f:[Lcom/google/android/gms/internal/ads/uk2$a;


# instance fields
.field private final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/google/android/gms/internal/ads/uk2$a;

    const/4 v1, 0x0

    const-string v2, "PLATFORM_UNSPECIFIED"

    invoke-direct {v0, v2, v1, v1}, Lcom/google/android/gms/internal/ads/uk2$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/ads/uk2$a;->c:Lcom/google/android/gms/internal/ads/uk2$a;

    new-instance v0, Lcom/google/android/gms/internal/ads/uk2$a;

    const/4 v2, 0x1

    const-string v3, "IOS"

    invoke-direct {v0, v3, v2, v2}, Lcom/google/android/gms/internal/ads/uk2$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/ads/uk2$a;->d:Lcom/google/android/gms/internal/ads/uk2$a;

    new-instance v0, Lcom/google/android/gms/internal/ads/uk2$a;

    const/4 v3, 0x2

    const-string v4, "ANDROID"

    invoke-direct {v0, v4, v3, v3}, Lcom/google/android/gms/internal/ads/uk2$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/ads/uk2$a;->e:Lcom/google/android/gms/internal/ads/uk2$a;

    const/4 v4, 0x3

    new-array v4, v4, [Lcom/google/android/gms/internal/ads/uk2$a;

    sget-object v5, Lcom/google/android/gms/internal/ads/uk2$a;->c:Lcom/google/android/gms/internal/ads/uk2$a;

    aput-object v5, v4, v1

    sget-object v1, Lcom/google/android/gms/internal/ads/uk2$a;->d:Lcom/google/android/gms/internal/ads/uk2$a;

    aput-object v1, v4, v2

    aput-object v0, v4, v3

    sput-object v4, Lcom/google/android/gms/internal/ads/uk2$a;->f:[Lcom/google/android/gms/internal/ads/uk2$a;

    new-instance v0, Lcom/google/android/gms/internal/ads/ul2;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/ul2;-><init>()V

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

    iput p3, p0, Lcom/google/android/gms/internal/ads/uk2$a;->b:I

    return-void
.end method

.method public static a(I)Lcom/google/android/gms/internal/ads/uk2$a;
    .locals 1

    if-eqz p0, :cond_2

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, Lcom/google/android/gms/internal/ads/uk2$a;->e:Lcom/google/android/gms/internal/ads/uk2$a;

    return-object p0

    :cond_1
    sget-object p0, Lcom/google/android/gms/internal/ads/uk2$a;->d:Lcom/google/android/gms/internal/ads/uk2$a;

    return-object p0

    :cond_2
    sget-object p0, Lcom/google/android/gms/internal/ads/uk2$a;->c:Lcom/google/android/gms/internal/ads/uk2$a;

    return-object p0
.end method

.method public static b()Lcom/google/android/gms/internal/ads/vz1;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/tl2;->a:Lcom/google/android/gms/internal/ads/vz1;

    return-object v0
.end method

.method public static values()[Lcom/google/android/gms/internal/ads/uk2$a;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/uk2$a;->f:[Lcom/google/android/gms/internal/ads/uk2$a;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/ads/uk2$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/ads/uk2$a;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/uk2$a;->b:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "<"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-class v1, Lcom/google/android/gms/internal/ads/uk2$a;

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

    iget v1, p0, Lcom/google/android/gms/internal/ads/uk2$a;->b:I

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
